package de.thielegram.shop;

public class Ingredient {
    private String name;
    private String isle;
    private int unit;

    public Ingredient(String name, String isle, int unit) {
        setName(name);
        setIsle(isle);
        setUnit(unit);
    }

    private String translateUnit(int unit){
        String unitName = "";

        switch(unit) {
            case 0: unitName = "Cup";
            break;

            case 1: unitName = "Tablespoon";
                break;

            case 2: unitName = "Fluid Ounce";
                break;

            case 3: unitName = "Gram";
                break;

            case 4: unitName = "Kilogram";
                break;

            case 5: unitName = "Liter";
                break;

            case 6: unitName = "Pound";
                break;

            case 7: unitName = "Milliliter";
                break;

            case 8: unitName = "Teaspoon";
                break;
        }

        return unitName;
    };

    private void setUnit(int unit) {
        this.unit = unit;
    }

    private void setIsle(String isle) {
        this.isle = isle;
    }

    private void setName(String name) {
        this.name = name;
    }
}
