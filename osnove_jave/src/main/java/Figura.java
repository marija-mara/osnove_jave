public abstract class Figura {
    public abstract double povrsina();
    public abstract double obim();
    public void stampaj(){
        System.out.println("Povrsina: " + this.povrsina());
        System.out.println("Obim: " + this.obim());
        System.out.println();
    }

}
