public class Spellbook{

  private Spell[] battleSpells;
  private Spell[] fieldSpells;
  private int numBattleSpells;
  private int numFieldSpells;

  public Spellbook(){
    this.battleSpells = new Spell[4];
    this.fieldSpells = new Spell[4];
    this.numBattleSpells = 0;
    this.numFieldSpells = 0;
  }

  public Spell[] getBattleSpells(){
    return battleSpells;
  }
  public Spell[] getFieldSpells(){
    return fieldSpells;
  }
  /*
   * Adds a battle magic spell to the spellbook
   */
  public void addBattleSpell(Spell s){
    /*
     * if there are more then 4 spells, one has to be deleted and s
     * will be added in it's place.
     */
    if (numBattleSpells >= 4){
      //ask which spell to delete, set s to that index.
      //not yet implemented
    }
    //If there are not four spells yet, adds s to the list.
    else{
      battleSpells[numBattleSpells] = s;
      numBattleSpells++;
    }
  }
  /*
   * Adds a field magic spell to the spellbook.
   */
  public void addFieldSpell(Spell s){
   /*
    * if there are more then 4 spells, one has to be deleted and s
    * will be added in it's place.
    */
    if (numFieldSpells >= 4){
      //ask which spell to delete, set s to that index.
      //not yet implemented
    }
    //If there are not four spells yet, adds s to the list.
    else{
      fieldSpells[numFieldSpells] = s;
      numFieldSpells++;
    }
  }
}
