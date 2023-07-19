# Hearty Harvest

# importing necessary modules 
from datetime import datetime
import random
import math

# defining constants 
MIN_TEMP = 0
MAX_TEMP = 100

# defining list of fruits and veggies
FRUITS = ['apple', 'pear', 'berry', 'banana', 'grape', 'mango']
VEGGIES = ['lettuce', 'spinach', 'carrot', 'asparagus', 'cucumber', 'celery']

# creating a list of Harvest objects
harvests = []

# defining class for Harvest objects
class Harvest:
    def __init__(self, name, temperature, variety, quantity):
        self.name = name
        self.temperature = temperature
        self.variety = variety
        self.quantity = quantity
   
    def __str__(self):
        return f"Name: {self.name}\nTemperature: {self.temperature} \nVariety: {self.variety} \nQuantity: {self.quantity}"

# function to create a new Harvest object
def create_harvest():
    # generating a datetime for harvest
    now = datetime.now()
    timestamp = datetime.timestamp(now)
    # generating a random temperature
    temperature = random.uniform(MIN_TEMP, MAX_TEMP)
    # randomly picking a fruit or veggie
    random_num = random.random()
    if random_num > 0.5:
        name = random.choice(FRUITS)
    else:
        name = random.choice(VEGGIES)
    # generating a random variety
    variety = math.floor(random.random() * 10)
    # generating a random quantity
    quantity = math.floor(random.random() * 50) + 1
    # creating a Harvest object
    harvest = Harvest(name, temperature, variety, quantity)
    # adding the Harvest object to the list
    harvests.append(harvest)

# creating 50 harvests 
for _ in range(50):
    create_harvest()

# printing all the Harvests in the list
for harvest in harvests:
    print(harvest)