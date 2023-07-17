-- Main Script:

local heartYield = 0  -- Initialize variable for heart yield
local days = 0  -- Initialize variable for days

-- Function to increase heart yield
function increaseHeartYield(numHearts)
	heartYield = heartYield + numHearts
end

-- Function to decrease heart yield
function decreaseHeartYield(numHearts)
	heartYield = heartYield - numHearts
end

-- Function to harvest hearts
function harvestHearts()
	if heartYield >= 10 then
		heartYield = heartYield - 10  -- Decrease heart yield by 10
		days = days + 1  -- Increment the day
		return 10  -- Return 10 harvested hearts
	else
		return 0  -- Return 0 harvested hearts
	end
end

-- Function to apply fertilizer
function applyFertilizer()
	increaseHeartYield(2)  -- Increase heart yield by 2
end

-- Function to apply pest repellant
function applyPestRepellant()
	decreaseHeartYield(1)  -- Decrease heart yield by 1
end

-- Function to irrigate the field
function irrigateField()
	increaseHeartYield(5)  -- Increase heart yield by 5
end

-- Function to print the heart yield
function printHeartYield()
	print("Heart yield: " .. heartYield)
end

-- Main loop
while true do
	-- Print the heart yield
	printHeartYield()

	-- Prompt user for input
	print("What would you like to do? (fertilize/pestrepellent/irrigate)")
	local input = io.read()  -- Read user input
	
	-- If input is to fertilize
	if input == "fertilize" then
		applyFertilizer()
	
	-- If input is to apply pest repellant
	elseif input == "pestrepellent" then
		applyPestRepellant()
	
	-- If input is to irrigate
	elseif input == "irrigate" then
		irrigateField()
	end
	
	-- Harvest hearts
	local harvestedHearts = harvestHearts()
	print("You harvested " .. harvestedHearts .. " hearts!")
	
	-- If 10 days have passed
	if days % 10 == 0 then
		break  -- Exit the loop
	end
end

-- Print the total heart yield
print("Congratulations! You harvested " .. heartYield .. " hearts in total!")