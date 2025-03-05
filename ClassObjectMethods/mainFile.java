public class mainFile {
    public static void main(String[] args) {
        data valueDATA = new data();

        for(int index = 0; index < valueDATA.StudentCode.length; index++){
            System.out.print(valueDATA.StudentCode[index] + "\t");
        }
        System.out.println();
        
        for(int index = 0; index < valueDATA.name.length; index++){
            System.out.print(valueDATA.name[index] + "\t");
        }
        System.out.println();

        for(int index = 0; index < valueDATA.subject.length; index++){
            System.out.print(valueDATA.subject[index] + "\t");
        }
        System.out.println();

        anotherData anotherOBJ = new anotherData();

        for(int index = 0; index < anotherOBJ.anotherArray.length; index++){
            System.out.print(anotherOBJ.anotherArray[index] + "\t");
        }
        System.out.println();

        for(int index = 0; index < anotherOBJ.veg.length; index++){
            System.out.print(anotherOBJ.veg[index] + "\t");
        }



    }
    
}
