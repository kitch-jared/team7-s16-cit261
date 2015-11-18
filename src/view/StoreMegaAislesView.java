/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**********************
 * The aisle views should display a list of items in that aisle.  So we will have to write a 
 * statement that checks which aisle they are in and then gets a list of the items in that 
 * aisle to display to the user and it's associated selection letter.
 **********************/

package view;

/**
 *
 * @author Maxine
 */
public class StoreMegaAislesView extends View {
    
    public StoreMegaAislesView() {
        super ("Store aisles:\n"
                + "P - Protein\n"
                + "S -  Sweets/Sugars\n" 
                + "C - Carbohydrates\n"
                + "T - Toiletries \n"
                + "F - First aid and medicine\n" 
                + "A - Clothing \n"
                + "B - Blankets\n"
                + "W - Water\n"
                + "X - Game Menu");
    }
    
    
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'P':
                enterProteinAisle();
                break;
            case 'S':
                enterSweetsAisle();
                break;
            case 'C':
                enterCarbohydratesAisle();
                break;
            case 'T':
                enterToiletriesAisle();
                break;
            case 'F':
                enterFirstAidAisl();
                break;
            case 'A':
                enterClothingAisle();
                break;
            case 'B':
                enterBlanketsAisle();
                break;
            case 'W':
                enterWaterAisle();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please enter a valid input");
            }
        return true;
    }
    private void enterProteinAisle() {
        System.out.println("NOT YET IMPLEMENTED");
    }

    private void enterSweetsAisle() {
       System.out.println("NOT YET IMPLEMENTED");
    }

    private void enterCarbohydratesAisle() {
       System.out.println("NOT YET IMPLEMENTED");
    }

    private void enterToiletriesAisle() {
       System.out.println("NOT YET IMPLEMENTED");
    }

    private void enterFirstAidAisl() {
       System.out.println("NOT YET IMPLEMENTED");
    }
    
    private void enterClothingAisle() {
       System.out.println("NOT YET IMPLEMENTED");
    }

    private void enterBlanketsAisle() {
       System.out.println("NOT YET IMPLEMENTED");
    }

    private void enterWaterAisle() {
        System.out.println("NOT YET IMPLEMENTED");
    }
}
