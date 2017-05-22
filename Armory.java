public class Armory{
  private Weapon weapon;
  private Armor helmet;
  private Armor chestPlate;
  private Armor leggings;
  private Armor boots;
  /*
   * Upgrades the weapon.
   * @param newWeapon the new desired weapon.
   */
  public void upgradeWeapon(Weapon newWeapon){
    this.weapon = newWeapon;
  }
  /*
   * Upgrades the helmet, if possible.
   * Does nothing if newHelmet is not a helmet.
   * @param newHelmet The new Helmet.
   */
  public void upgradeHelmet(Weapon newHelmet){
    if (newHelmet.getIntPos() == 1)
    this.helmet = newHelmet;
  }
  /*
   * Upgrades the chestPlate, if possible.
   * Does nothing if newChest is not a chestPlate.
   * @param newChest The new chestPlate.
   */
  public void upgradeChest(Armour newChest){
    if (newChest.getIntPos() == 2)
    this.chestPlate = newChest;
  }
  /*
   * Upgrades the leggings, if possible.
   * Does nothing if newLegs is not a leggings.
   * @param newLegs The new leggings.
   */
  public void upgradeLegs(Armour newLegs){
      if (newLegs.getIntPos == 3)
      this.leggings = newLegs;
  }
  /*
   * Upgrades the boots, if possible.
   * Does nothing if newBoots is not a boots.
   * @param newBoots The new boots.
   */
  public void upgradeChest(Armour newBoots){
    if (newBoots.getIntPos()) == 4;
    this.boots = newBoots;
  }

  /*
   * Returns the weapon in the Armory
   * @return The weapon object in the Armory.
   */
  public Weapon getWeapon(){
    return weapon;
  }
  /*
   * Returns the chestPlate in the Armory
   * @return The chestPlate Armor object in the Armory.
   */
   public Armor getHelmet(){
     return helmet;
   }
   /*
    * Returns the leggings in the Armory
    * @return The leggings Armor object in the Armory.
    */
  public Armor getChest(){
    return chestPlate;
  }
  /*
   * Returns the helmet in the Armory
   * @return The helmet Armor object in the Armory.
   */
  public Armor getLegs(){
    return leggings;
  }
  /*
   * Returns the boots in the Armory
   * @return The boots Armor object in the Armory.
   */
  public Armor getBoots(){
    return boots;
  }

  /*
   * Returns the total defense your armor gives you.
   * @return The int value of the total defense from each armor item.
   */
  public int getArmorDefense(){
    return helmet.getDefense() + boots.getDefense()
    + chestPlate.getDefense() + leggings.getDefense();
  }
}
