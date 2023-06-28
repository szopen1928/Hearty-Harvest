import { Harvest } from 'hearty-harvest';

class HeartyHarvest {
    private harvest: Harvest;

    constructor(harvestParams: {[key: string]: any}) {
        this.harvest = new Harvest(harvestParams);
    }

    public addHarvest(harvestParams: {[key: string]: any}) {
        this.harvest.add(harvestParams);
    }

    public removeHarvest(harvestId: number) {
        this.harvest.remove(harvestId);
    }

    public getHarvest(harvestId: number) {
        this.harvest.get(harvestId);
    }

    public getAllHarvests() {
        this.harvest.getAll();
    }

    public updateHarvest(harvestId: number, harvestParams: {[key: string]: any}) {
        this.harvest.update(harvestId, harvestParams);
    }

    public filterHarvests(filterParams: {[key: string]: any}) {
        this.harvest.filter(filterParams);
    }

    public clearHarvest() {
        this.harvest.clear();
    }

    public setHarvestListener(listener: HarvestListener) {
        this.harvest.listen(listener);
    }
}

// Definition of a HarvestListener interface
interface HarvestListener {
    (harvestId: number, harvestParams: {[key: string]: any}): void;
}

// Sample harvest listener
const myHarvestListener = (harvestId: number, harvestParams: {[key: string]: any}) => {
    console.log(`Received update for harvest ${harvestId}: ${harvestParams}`);
};

// Sample code to create an instance of HeartyHarvest
const harvestParams = { type: 'apple', quantity: 5 };
const heartyHarvest = new HeartyHarvest(harvestParams);

// Setting a HarvestListener
heartyHarvest.setHarvestListener(myHarvestListener);

// Adding a new harvest
const appleHarvestParams = { type: 'apple', quantity: 10 };
heartyHarvest.addHarvest(appleHarvestParams);

// Updating a harvest
const updatedHarvestParams = { type: 'apple', quantity: 15 };
heartyHarvest.updateHarvest(1, updatedHarvestParams);

// Removing a harvest
heartyHarvest.removeHarvest(1);

// Filtering harvests
const filterParams = { type: 'apple' };
heartyHarvest.filterHarvests(filterParams);

// Getting a harvest
heartyHarvest.getHarvest(1);

// Getting all harvests
heartyHarvest.getAllHarvests();

// Clearing all harvests
heartyHarvest.clearHarvest();