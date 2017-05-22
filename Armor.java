public class Armor{
  private int defense;
  private String name;
  private int position;

  /*
   * Constructs a new Armor item with an int based position.
   * @param defense The item's defense stat
   * @param name The item's name
   * @param position The position of the item.
   * helmet is position 1, chest is position 2,
   * leg is position 3, and boot is position 4.
   */
  public Armor(int defense, String name, int position){
    this.defense = defense;
    this.name = name;
    this.position = position;
  }
  /*
   * Constructs a new Armor item with a String based position.
   * @param defense The item's defense stat
   * @param name The item's name
   * @param position The position of the item.
   * helmet becomes position 1, chest becomes position 2,
   * leg becomes position 3, and boot becomes position 4.
   * Anything else becomes position 0.
   */
  public Armor(int defense, String name, String position){
    this.defense = defense;
    this.name = name;
    this.position = (position.equalsIgnoreCase("helmet") ? 1 :
    (position.toLowerCase().startsWith("chest") ? 2 :
    (position.toLowerCase().startsWith("leg") ? 3 :
    (position.toLowerCase().startsWith("boot") ? 4 : 0))));
  }
  /**
   * Returns the defense of the Armor item.
   * @return An integer represting the defense the armor gives.
   */
  public int getDefense(){
    return defense;
  }
  /**
   * Returns the name of the Armor item.
   * @return The String the Armor item is named.
   */
  public String getName(){
    return name;
  }
  /**
   * Returns the position of the Armor item as an int.
   * @return An integer represting the position of the armor.
   * helmet is position 1, chest is position 2,
   * leg is position 3, and boot is position 4.
   */
  public int getIntPos(){
    return position;
  }
  /**
   * Returns the position of the Armor item as a String.
   * @return A String represting the position of the armor.
   * helmet is position 1, chest is position 2,
   * leg is position 3, and boot is position 4.
   */
  public String getStringPos(){
    return (position == 1 ? "helmet" : (position == 2 ? "chest" :
    (position == 3 ? "leggings" : (position == 4 ? "boots" : "???"))));
  }
}
