package HW_6;

 class Dog extends Animals{
     @Override
     public void run(int meters) {
         if (meters <= 500 ) {
             System.out.println("Dog пробежал " + meters + " м.");
         } else {
             System.out.println("Dog пробежал больше 500 метров и устал! ");
         }
     }

     @Override
     public void swim(int meters) {
         if (meters <= 10) {
             System.out.println("Dog проплыл " + meters + " м.");
         } else {
             System.out.println("Dog проплыл больше 10 метров и устал! ");
         }
     }
 }
