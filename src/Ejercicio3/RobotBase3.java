package Ejercicio3;

import becker.robots.*;
import java.util.Arrays;
/*
Grupo conformado por:
Germán Muñoz
Diego Rubiano
Samuel Salgado
Julian Santos
Josef Sarmiento
*/
public class RobotBase3
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
       
	public static void main (String[] args){
        int[]arrayRobot=new int[15];
        int[] num0={1,0,0,0,1,1,1,1,1,1,1,1,1,1,1};
        int[] num1={0,0,0,0,0,0,0,0,0,0,1,1,1,1,1};
        int[] num2={1,0,1,0,1,1,0,1,1,1,1,0,1,1,1};
        int[] num3={1,0,1,0,1,1,0,1,0,1,1,1,1,1,1};
        int[] num4={0,0,1,0,0,1,1,1,0,0,1,1,1,1,1};
        int[] num5={1,0,1,0,1,1,1,1,0,1,1,1,1,0,1};
        int[] num6={1,0,1,0,1,1,1,1,1,1,1,1,1,0,1};
        int[] num7={0,0,0,0,1,1,0,0,0,0,1,1,1,1,1};
        int[] num8={1,0,1,0,1,1,1,1,1,1,1,1,1,1,1};
        int[] num9={1,0,1,0,1,1,1,1,0,1,1,1,1,1,1};
        int[] temp=new int[15];
   
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,6, 2, Direction.NORTH,10);
            
            for (int k=1; k<=3;k++)    {
    for (int i=0; i<=14; i++){
            arrayRobot[i]=0;
            } 
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[0] = 1;
}
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[1]=1;
}
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[2]=1;
}
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[3]=1;
}
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[4]=1;
}
estudiante.turnLeft();
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[5]=1;
}
estudiante.turnLeft();
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[6]=1;
}
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[7]=1;
}
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[8]=1;
}
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[9]=1;
}
estudiante.turnLeft();
estudiante.move();
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[10]=1;
}
estudiante.turnLeft();
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[11]=1;
}
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[12]=1;
}
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[13]=1;
}
estudiante.move();
if (estudiante.canPickThing()==true){
arrayRobot[14]=1;
}
estudiante.turnLeft();
estudiante.move();
estudiante.turnLeft();
estudiante.move();
estudiante.move();
estudiante.move();
estudiante.move();
estudiante.move();
estudiante.turnLeft();
estudiante.move();
estudiante.move();
estudiante.move();
estudiante.turnLeft();

temp=arrayRobot;
if(Arrays.equals(temp,num0))
    System.out.println("El "+k+"° escaneado es: 0");
if(Arrays.equals(temp,num1))
    System.out.println("El "+k+"° escaneado es: 1");
if(Arrays.equals(temp,num2))
    System.out.println("El "+k+"° escaneado es: 2");
if(Arrays.equals(temp,num3))
    System.out.println("El "+k+"° escaneado es: 3");
if(Arrays.equals(temp,num4))
    System.out.println("El "+k+"° escaneado es: 4");
if(Arrays.equals(temp,num5))
    System.out.println("El "+k+"° escaneado es: 5");
if(Arrays.equals(temp,num6))
    System.out.println("El "+k+"° escaneado es: 6");
if(Arrays.equals(temp,num7))
    System.out.println("El "+k+"° escaneado es: 7");
if(Arrays.equals(temp,num8))
    System.out.println("El "+k+"° escaneado es: 8");
if(Arrays.equals(temp,num9))
    System.out.println("El "+k+"° escaneado es: 9");

        }
    }
}