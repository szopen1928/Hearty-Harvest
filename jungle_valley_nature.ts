// Welcome to Hearty Harvest

// File: HeartyHarvest.ts

// 1. Define Imports 
import { 
    Crop, 
    CropConfig,
    Farm,
    FarmType, 
    Harvest, 
    HarvestType 
} from './heartyHarvestTypes';

// 2. Define Global Variables 
let autoHarvest: HarvestType = "manual";
let runningFarmIds: number[] = [];

// 3. Define Farm Class 
class Farm {
    id: number;
    name: string;
    type: FarmType;
    crops: Crop[];
    config: CropConfig;

    constructor(id: number, name: string, type: FarmType,
         crops: Crop[], config: CropConfig) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.crops = crops;
        this.config = config;
    }

    // 4. Add Farm Method 
    addFarm(name: string, type: FarmType, crops: Crop[],
        config: CropConfig): void {
        const newFarmId: number = runningFarmIds.length + 1;
        const newFarm: Farm = new Farm(newFarmId, name, type,
            crops, config);
        runningFarmIds.push(newFarmId);
        console.log(`Added ${name} farm with id ${newFarmId}`);
    }

    // 5. Get Farm Method 
    getFarm(id: number): Farm | null {
        const requestedFarm: Farm | undefined = runningFarmIds
            .find((farmId: number) => farmId === id);
        if (requestedFarm) {
            return requestedFarm;
        } else {
            return null;
        }
    }
	
	// 6. Update Farm Method 
    updateFarm(id: number, changes: any): void {
        const requestedFarm: Farm | null = this.getFarm(id);
        if (requestedFarm) {
            for (const change in changes) {
                if (requestedFarm.hasOwnProperty(change)) {
                    requestedFarm[change] = changes[change];
                }
            }
            console.log(`Updated ${requestedFarm.name} farm with id ${id}`);
        } else {
            console.error('Could not find farm with id ' + id);
        }
    }
	
	// 7. Delete Farm Method 
    deleteFarm(id: number): void {
        const requestedFarm: number | undefined = runningFarmIds
            .findIndex((farmId: number) => farmId === id);
        if (requestedFarm >= 0) {
            runningFarmIds.splice(requestedFarm, 1);
            console.log(`Deleted farm with id ${id}`);
        } else {
            console.error('Could not find farm with id ' + id);
        }
    }
	
	// 8. Start Harvest Method 
    startHarvest(id: number, type: HarvestType): void {
        const requestedFarm: Farm | null = this.getFarm(id);
        if (requestedFarm) {
            if (type === 'auto' || type === 'manual') {
                autoHarvest = type;
                console.log(`Started ${requestedFarm.name} harvest with ${type} type`);
            } else {
                console.error('Harvest type not supported');
            }
        } else {
            console.error('Could not find farm with id ' + id);
        }
    }

    // 9. Stop Harvest Method 
    stopHarvest(id: number): void {
        const requestedFarm: Farm | null = this.getFarm(id);
        if (requestedFarm) {
            autoHarvest = 'manual';
            console.log(`Stopped ${requestedFarm.name} harvest`);
        } else {
            console.error('Could not find farm with id ' + id);
        }
    }

    // 10. Harvest Crops Method 
    harvestCrops(id: number, type: HarvestType): Harvest[] {
        const requestedFarm: Farm | null = this.getFarm(id);
        let harvestedCrops: Harvest[] = [];
        if (requestedFarm) {
            if (type === 'auto' || (type === 'manual' && autoHarvest === 'manual')) {
                for (const crop of requestedFarm.crops) {
                    harvestedCrops.push(new Harvest(crop.name, crop.quantity, crop.price));
                }
                console.log(`Harvested ${harvestedCrops.length} crops from ${requestedFarm.name} farm`);
            } else {
                console.error('Harvest type not supported');
            }
        } else {
            console.error('Could not find farm with id ' + id);
        }
        return harvestedCrops;
    }
}