%% Hearty Harvest

function heartyHarvest()

% Initialize parameters and counters
harvestSize = 100;
totalHarvested = 0;

% Begin harvesting
while totalHarvested < harvestSize
    
    % Randomly select a number of apples to add to the harvest
    applesToHarvest = round(rand(1) * 10);
    
    % Add the harvested amount to the total
    totalHarvested = totalHarvested + applesToHarvest;
    
    % Output the amount harvested
    fprintf('Harvested %d apples. Total harvested = %d\n', applesToHarvest, totalHarvested);
    
end

% Output the final harvest amount
fprintf('Final harvest size is %d\n', totalHarvested);

end