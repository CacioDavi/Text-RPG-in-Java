package Species;

public enum Specie {
    Human("Human", 23f, 10f, 50f),
    Elf("Elf", 20f, 30f, 30f),
    Dwarf("Dwarf", 25f, 15f, 30f);

    private String Name;
    private Float baseLife;
    private Float baseVelocity;
    private Float baseStrength;
    
    private Specie(String Name, Float baseLife, Float baseVelocity, Float baseStrength) {
        this.Name = Name;
        this.baseLife = baseLife;
        this.baseVelocity = baseVelocity;
        this.baseStrength = baseStrength;
    }
}
