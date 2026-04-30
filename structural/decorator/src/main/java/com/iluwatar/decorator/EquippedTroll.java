package com.iluwatar.decorator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public abstract class EquippedTroll implements Troll {
  private final Troll equippedTroll; //aka wrappedTroll

  @Setter
  @Getter
  private String weapon;

  public EquippedTroll(Troll troll){
    this.equippedTroll=troll;
  }

  @Override
  public void attack() {
    equippedTroll.attack();
  }

  @Override
  public int getAttackPower() {
    return equippedTroll.getAttackPower();
  }

  // Collects weapons from the entire chain recursively
  protected List<String> getWeapons() {
    List<String> allWeapons = new ArrayList<>();
    allWeapons.add(this.weapon); // add own weapon first

    if (equippedTroll instanceof EquippedTroll) {
      allWeapons.add(((EquippedTroll) equippedTroll).getWeapon());
    }

    return allWeapons;
  }

  @Override
  public void fleeBattle() {
    List<String> allWeapons = getWeapons();
    String weaponList = String.join(", ", allWeapons);
    LOGGER.info("The troll holding {} runs away!", weaponList);
  }

}
