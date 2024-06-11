public class AAC_IfEls {
    public static void main(String[] args) {
        int ageToGetInRollerCoast = 18;
        float heightToGetOnRollerCoast = 1.5F;

        if (ageToGetInRollerCoast<18) {
            System.out.println("You not old enough to get in the roller coast");
        }else if (ageToGetInRollerCoast >= 18){
            System.out.println("You're old enough to get in the roller coast");
        }

        if (heightToGetOnRollerCoast<1.5f){
            System.out.println("You're not tall enough to get in");
        }else{
            System.out.println("you are tall enough to get in the roller cosast");
        }

        if (ageToGetInRollerCoast >=18 && heightToGetOnRollerCoast >= 1.5F){
            System.out.println("You're allowed to get in");
        }
    }
}
