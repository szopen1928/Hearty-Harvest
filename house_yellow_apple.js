// Begin file

//Assign Variables
const greeting = "Welcome to Hearty Harvest";
const products = ["Apples", "Oranges", "Kiwi", "Bananas"];
const monthlySpecial = "10% off all fruit!";
const deliveryFee = 4.99;

//Print greeting
console.log(greeting);

//Print product list
for (let i = 0; i < products.length; i++) {
	console.log(products[i]);
}

//Print monthly special
console.log(monthlySpecial);

//Create getTotalPrice function
function getTotalPrice(product, quantity) {
	let price;
	if (product == "Apples") {
		price = 3.99;
	} else if (product == "Oranges") {
		price = 4.99;
	} else if (product == "Kiwi") {
		price = 5.99;
	} else if (product == "Bananas") {
		price = 2.99;
	}
	let totalPrice = (price * quantity) + deliveryFee;
	return totalPrice;
}

//Test getTotalPrice
let testTotalPrice = getTotalPrice("Apples", 3);
console.log("The total price for 3 Apples is " + testTotalPrice);

//Create  getDiscountedPrice function
function getDiscountedPrice(product, quantity) {
	let discountedPrice = (getTotalPrice(product, quantity) * 0.9).toFixed(2);
	return discountedPrice;
}

//Test getDiscountedPrice
let testDiscountedPrice = getDiscountedPrice("Apples", 3);
console.log("The discounted price for 3 Apples is " + testDiscountedPrice);

//Create getOrderSummary function
function getOrderSummary(product, quantity) {
	let orderSummary = "You ordered " + quantity + " " + product + " for " + getDiscountedPrice(product, quantity) + " including delivery.";
	return orderSummary;
}

//Test getOrderSummary
let testOrderSummary = getOrderSummary("Bananas", 5);
console.log(testOrderSummary);

//End file