import java.io.*;
          
          interface Vehicle 
          {
          
              void changeGear(int a);
              void speedUp(int a);
              void applyBrakes(int a);
          }
          
          class Car implements Vehicle
          {
              
              int speed;
              int gear;
              
              // to change gear override method here
              public void changeGear(int newGear)
              {
                  
                  gear = newGear;
              }
              
              // to increase speed @Override
              public void speedUp(int increment)
              {
                  
                  speed = speed + increment;
              }
              
              // to decrease speed @Override
              public void applyBrakes(int decrement)
              {
                  
                  speed = speed - decrement;
              }
              
              public void printStates() 
              {
              System.out.println("speed: " + speed+ " gear: " + gear);
              }
          }
          
          class Bike implements Vehicle 
          {
              
              int speed;
              int gear;
              
              // to change gear @Override
              public void changeGear(int newGear)
              {
                  
                  gear = newGear;
              }
              
              // to increase speed @Override
              public void speedUp(int increment)
              {
                  
                  speed = speed + increment;
              }
              
              // to decrease speed @Override
              public void applyBrakes(int decrement)
              {
                  
                  speed = speed - decrement;
              }
              
              public void printStates()
              {
              System.out.println("speed: " + speed + " gear: " + gear);
              }
              
          }
          class GFG {
              
              public static void main (String[] args) 
              {
              
                  // creating an inatance of Bicycle
                  // doing some operations
                  Car car = new Car();
                  car.changeGear(2);
                  car.speedUp(3);
                  car.applyBrakes(1);
                  
                  System.out.println("Car present state :");
                  car.printStates();
                  
                  // creating an instance of bike
                  Bike bike = new Bike();
                  bike.changeGear(1);
                  bike.speedUp(4);
                  bike.applyBrakes(3);
                  
                  System.out.println("Bike present state :");
                  bike.printStates();
              }
          }