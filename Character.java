public class Character{
  public static final double DEFENSE_CONSTANT = 25;
  private double health;
  private int maxHealth;
  private int attack;
  private int defense;
  private int magic;
  private int xp;
  private int level;
  private boolean dead;
  private Armory gear;
  private Backpack bag;
  private Spellbook spells;
  private static Random rand = new Random();

  public int getFullDefense(){
    return this.defense + this.gear.getArmorDefense();
  }

  public int getFullMagic(){
    return this.magic + this.gear.getWeapon().getMagic();
  }
  /*
   * Takes damage from a physical (weapon) hit. The defense is calculated as
   * DEFENSE_CONSTANT/DEFENSE_CONSTANT+defense, meaning if DEFENSE_CONSTANT = 25,
   * and the defender has 25 defense, he takes 50% damage.
   * @param baseDamage the base damage the attacker is attacking with.
   * @return true if the defender is dead after the damage.
   */
  public boolean takePhysDamage(int baseDamage){
    this.health -= baseDamage * (DEFENSE_CONSTANT/(DEFENSE_CONSTANT+getFullDefense()));
    this.dead = (this.health < 1);
    return this.dead;
  }
  /*
   * Takes damage from a magical (spell) hit. The defense is calculated as
   * DEFENSE_CONSTANT/magic, but an attacker cannot take more than 1.1 times the base damage
   * @param baseDamage the base damage the attacker is attacking with.
   * @return true if the defender is dead after the damage.
   */
  public boolean takeMagDamage(int baseDamage){
    this.health -= baseDamage * (DEFENSE_CONSTANT/this.getFullMagic() > 1.1 ? 1.1 : DEFENSE_CONSTANT/this.getFullMagic());
    this.dead = (this.health < 1);
    return this.dead;
  }

  public void physAttack(Character defender){
    defender.takePhysDamage(attack + this.gear.getWeapon().getAttack());
  }
  public void magAttack(Character defender){
    defender.takeMagDamage(this.getFullMagic());
  }
  public void gainXp(int newXp){
    this.xp += newXp;
    while(this.xp >= 100){
      levelUp();
      this.xp-=100;
    }
  }
  /**
   * Levels the character up, adding a guarenteed point to a random stat, and
   * having two seperate 1/3 chances to level up each stats, and giving the
   * user an option for one stat. allowing for a min
   * of two points and a max of 10 points, depending on luck.
   */
  public void levelUp(){
    // 3/4 chance to go on
    if(rand.nextInt(16)%4!=0){
      // 2/3 chance to go on.
      if(rand.nextInt(12)%3!=0){
        // 1/2 chance to go on
        if(rand.nextInt(4)%2!=0){
          // 3/4 * 2/3 * 1/2 = 1/4 chance
          this.magic+=1;
        }
        // 3/4 * 2/3 * 1/2 = 1/4 chance
        else this.defense+=1;
      }
      // 3/4 * 1/3 = 1/4 chance
      else this.attack+=1;
    }
    // 1/4 chance.
    else this.maxHealth += 10;

    if(rand.nextInt(51)%3==0) this.maxHealth += 10;
    if(rand.nextInt(51)%3==0) this.maxHealth += 10;

    if(rand.nextInt(51)%3==0) this.attack += 1;
    if(rand.nextInt(51)%3==0) this.attack += 1;

    if(rand.nextInt(51)%3==0) this.defense += 1;
    if(rand.nextInt(51)%3==0) this.defense += 1;

    if(rand.nextInt(51)%3==0) this.magic += 1;
    if(rand.nextInt(51)%3==0) this.magic += 1;

    //getUserLevelUp()//DNE yet
  }
}
