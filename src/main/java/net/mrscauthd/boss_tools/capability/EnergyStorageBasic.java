package net.mrscauthd.boss_tools.capability;

import java.util.Optional;

import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.energy.EnergyStorage;

public class EnergyStorageBasic extends EnergyStorage implements INBTSerializable<CompoundTag> {

	private final IEnergyStorageHolder holder;

	public EnergyStorageBasic(IEnergyStorageHolder holder, int capacity, int maxReceive, int maxExtract, int energy) {
		super(capacity, maxReceive, maxExtract, energy);
		this.holder = holder;
	}

	public EnergyStorageBasic(IEnergyStorageHolder holder, int capacity, int maxReceive, int maxExtract) {
		super(capacity, maxReceive, maxExtract);
		this.holder = holder;
	}

	public EnergyStorageBasic(IEnergyStorageHolder holder, int capacity, int maxTransfer) {
		super(capacity, maxTransfer);
		this.holder = holder;
	}

	public EnergyStorageBasic(IEnergyStorageHolder holder, int capacity) {
		super(capacity);
		this.holder = holder;
	}

	@Override
	public int receiveEnergy(int maxReceive, boolean simulate) {
		if (!this.canReceive()) {
			return 0;
		} else {
			int energyReceived = Math.min(this.getMaxEnergyStored() - this.getEnergyStored(), maxReceive);
			if (!simulate && energyReceived > 0) {
				this.energy += energyReceived;
				Optional.ofNullable(this.getHolder()).ifPresent(h -> h.onEnergyChanged(this, +energyReceived));
			}

			return energyReceived;
		}
	}

	@Override
	public int extractEnergy(int maxExtract, boolean simulate) {
		if (!this.canExtract()) {
			return 0;
		} else {
			int energyExtracted = Math.min(this.getEnergyStored(), maxExtract);
			if (!simulate && energyExtracted > 0) {
				this.energy -= energyExtracted;
				Optional.ofNullable(this.getHolder()).ifPresent(h -> h.onEnergyChanged(this, -energyExtracted));
			}

			return energyExtracted;
		}
	}

	public int getMaxExtract() {
		return this.maxExtract;
	}

	@Override
	public boolean canExtract() {
		return this.getMaxExtract() > 0;
	}

	public int getMaxReceive() {
		return this.maxReceive;
	}

	@Override
	public boolean canReceive() {
		return this.getMaxReceive() > 0;
	}

	public IEnergyStorageHolder getHolder() {
		return this.holder;
	}

	@Override
	public CompoundTag serializeNBT() {
		CompoundTag compound = new CompoundTag();
		compound.putInt("energy", this.energy);
		return compound;
	}


	@Override
	public void deserializeNBT(CompoundTag compound) {
		this.energy = compound.getInt("energy");
	}

}
