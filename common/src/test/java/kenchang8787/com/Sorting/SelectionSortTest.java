package kenchang8787.com.Sorting;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SelectionSortTest {

  @Contract(value = " -> new", pure = true)
  private @NotNull ISortable getInstance() {
    return new SelectionSort();
  }

  @Test
  public void inputWithNull() {

    var sortable = getInstance();

    var actual = sortable.sort((int[]) null);

    assertNull(actual);
  }

  @Test
  public void inputWithEmpty() {

    var sortable = getInstance();

    var actual = sortable.sort();

    assertEquals(0, actual.length);
  }

  @Test
  public void inputOrderedArray() {

    var sortable = getInstance();

    var actual = sortable.sort(1, 2, 5, 8, 10, 15, 199);

    assertEquals(Arrays.toString(new int[] {1, 2, 5, 8, 10, 15, 199}), Arrays.toString(actual));
  }

  @Test
  public void inputUnOrderedArray() {

    var sortable = getInstance();

    var actual = sortable.sort(-10, 200, -5, 3, -8, -200);

    assertEquals(Arrays.toString(new int[] {-200, -10, -8, -5, 3, 200}), Arrays.toString(actual));
  }
}
