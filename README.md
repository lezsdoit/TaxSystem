# TaxSystemDescription
You have to implement a custom service for a billing system that calculates the tax and the discount on a given product based on the tax slab and discount percentage provided in the JSON configuration.
● Tax is applied to the product based on the min and max price mentioned in the config
● Tax A will be applied if the price range of the product is greater than 1000 and less than
equal to 7500 which is 12% of the price as mentioned in the config below
● Tax B will be applied for all the product where the price is above 7500 and the tax
percentage to be 18% on the price
● Tax C will be applied to all the products which are flat 200
● The tax will be applied to each of the product and not on the entire bill
● A bill can have more than one product with different price
● A discount percentage will be applied to the base price


config

{
  "taxA": {
    "minPrice": 1000,
    "maxPrice": 7500,
    "tax": 12,
    "type": "percentage"
  },
  "taxB": {
    "minPrice": 7500,
    "tax": 18,
    "type": "percentage"
  },
  "taxC": {
    "minPrice": 0,
    "tax": 200,
    "type": "fixed"
  }
}


input:
{
  "item": "itemA", "basePrice": 120000, "discount": 5
}

output: finalPrice after taxation and discount 135800.

Summary: I have used SOLID design principles to make a tax calculator system which is scalable, modular, extensible and readable.
