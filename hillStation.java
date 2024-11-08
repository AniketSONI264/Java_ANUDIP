class HillStation {
    public void location() {
        System.out.println("Nhi pata bhai Mujhe....");
    }
    public void famousFor() {
        System.out.println("Ye bhi nhi pata ....");
    }
}

class Masoori extends HillStation {
    @Override
    public void location() {
        System.out.println("Masoori ka bhi kuch pata nhii ...");
    }
    @Override
    public void famousFor() {
        System.out.println("Pata nhi kisliye Famous h Masoori....");
    }
}

class Gulmarg extends HillStation {
    @Override
    public void location() {
        System.out.println("Gulmarg ka name hi pahli bar sun rha hu ...");
    }
    @Override
    public void famousFor() {
        System.out.println("Gulmarg ka bhi nhi pata...");
    }
}

class Manali extends HillStation {
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali ke bare me thoda thoda pata h ...");
    }
}


public class run {  
    public static void main(String[] args) {
        HillStation ms = new Masoori();
        HillStation gm = new Gulmarg();
        HillStation mn = new Manali();
        ms.location();
        ms.famousFor();
        gm.location();
        gm.famousFor();
        mn.location();
        mn.famousFor();
    }
}
