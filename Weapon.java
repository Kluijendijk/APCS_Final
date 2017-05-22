public class Weapon{
  private int attack;
  private int magic;
  private String name;
  /*
   * Constructs a new Weapon.
   * @param attack The Weapon's attack stat
   * @param magic The Weapon's magic stat
   * @param name The Weapon's name
   */
  public Weapon(int attack, int magic, String name){
    this.attack = attack;
    this.magic = magic;
    this.name = name;
  }
  /**
   * Returns the attack of the weapon.
   * @return An integer represting the attack damage the weapon gives.
   */
  public int getAttack(){
    return attack;
  }
  /**
   * Returns the magic of the weapon.
   * @return An integer represting the magic damage the weapon gives.
   */
  public int getMagic(){
    return magic;
  }
  /**
   * Returns the name of the weapon.
   * @return The String the weapon is named.
   */
  public String getName(){
    return name;
  }
}
