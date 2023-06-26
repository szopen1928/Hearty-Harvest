# A Simple Ruby Program to Harvest Hearty Fruit

# Define our class
class HeartyHarvest
  # Define a variable for our Harvest
  @@harvest = []

  # Define a constructor
  def initialize
    puts "Harvesting has begun!"
  end

  # Define a method to add fruit to our Harvest
  def add_fruit(fruit)
    @@harvest.push(fruit)
  end

  # Define a method to check what we have in our Harvest
  def check_harvest
    puts "The harvest so far contains #{@@harvest}"
  end
end

# instantiate object
harvest = HeartyHarvest.new

# Add some fruit to our Harvest
harvest.add_fruit("Apples")
harvest.add_fruit("Bananas")
harvest.add_fruit("Strawberries")

# Check the Harvest
harvest.check_harvest

# Output
puts "Successfully added three pieces of fruit to the harvest!"