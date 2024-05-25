class Animal {
    private String color;
    private int edad;
    private String genero;

    public Animal(String color, int edad, String genero) {
        this.color = color;
        this.edad = edad;
        this.genero = genero;
    }

    public void comer() {
        System.out.println("El animal está comiendo.");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

class Mamifero extends Animal {
    public Mamifero(String color, int edad, String genero) {
        super(color, edad, genero);
    }
}

class Ave extends Animal {
    public Ave(String color, int edad, String genero) {
        super(color, edad, genero);
    }
}

class Pez extends Animal {
    public Pez(String color, int edad, String genero) {
        super(color, edad, genero);
    }
}

class Perro extends Mamifero {
    public Perro(String color, int edad, String genero) {
        super(color, edad, genero);
    }

    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }
}

class Gato extends Mamifero {
    public Gato(String color, int edad, String genero) {
        super(color, edad, genero);
    }

    public void aullar() {
        System.out.println("El gato está aullando.");
    }
}

class Aguila extends Ave {
    public Aguila(String color, int edad, String genero) {
        super(color, edad, genero);
    }

    public void volar() {
        System.out.println("El águila está volando.");
    }
}

class PezDorado extends Pez {
    public PezDorado(String color, int edad, String genero) {
        super(color, edad, genero);
    }

    public void nadar() {
        System.out.println("El pez dorado está nadando.");
    }
}

public class herencia {
    public static void main(String[] args) {
        Perro perro = new Perro("Marrón", 5, "Macho");
        Gato gato = new Gato("Blanco", 3, "Hembra");
        Aguila aguila = new Aguila("Negro", 4, "Macho");
        PezDorado pezDorado = new PezDorado("Dorado", 2, "Hembra");

        perro.comer();
        perro.dormir();
        perro.ladrar();

        gato.comer();
        gato.dormir();
        gato.aullar();

        aguila.comer();
        aguila.dormir();
        aguila.volar();

        pezDorado.comer();
        pezDorado.dormir();
        pezDorado.nadar();
    }
}
