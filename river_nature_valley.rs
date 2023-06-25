fn main() {
    println!("Welcome to Hearty Harvest!");

    let num_plants: i32 = 10;
    let num_fruits: i32 = 5;
    let num_vegetables: i32 = 2;

    let mut total_produce: i32 = 0;
    let mut produce_list: Vec<&str> = vec![];

    // Plant the fruits
    for i in 0..num_fruits {
        println!("Planting fruit #{}", i + 1);
        total_produce += 1;
        produce_list.push("Fruit");
    }

    // Plant the vegetables
    for i in 0..num_vegetables {
        println!("Planting vegetable #{}", i + 1);
        total_produce += 1;
        produce_list.push("Vegetable");
    }

    // Till the ground
    println!("Tilling the ground for {} plants", num_plants);
    for i in 0..num_plants {
        println!("Tilling plant #{}", i + 1);
    }

    // Water the plants
    println!("Watering {} plants", num_plants);
    for i in 0..num_plants {
        println!("Watering plant #{}", i + 1);
    }

    // Harvest the produce
    println!("Harvesting {} produce", total_produce);
    for i in 0..total_produce {
        println!("Harvesting {} #{}", produce_list[i], i + 1);
    }

    // Store the produce
    println!("Storing {} produce", total_produce);
    for i in 0..total_produce {
        println!("Storing {} #{}", produce_list[i], i + 1);
    }

    println!("The harvest is complete!");
}