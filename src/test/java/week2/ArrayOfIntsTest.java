package week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsTest {
    ArrayOfInts arrayOfInts = new ArrayOfInts();
    ArrayOfInts findCommonElements = new ArrayOfInts();

    ArrayOfInts findDuplicateValues = new ArrayOfInts();

    @Test void sumOfIntsUnique_InvalidParameter(){
        assertEquals(0,arrayOfInts.sumOfUniqueValidNumbers(null));

    }

    @Test void arrayOfIntsUnique_NumberAbove1000(){
        assertEquals(1011,
                arrayOfInts.sumOfUniqueValidNumbers(new int[] {1,2,3,5,1000,1001}));
    }

    @Test void arrayOfIntsUnique_NegativeNumber_ThrowException(){
        assertThrows(IllegalArgumentException.class, () ->
                arrayOfInts.sumOfUniqueValidNumbers(new int[] {1,2,3,5,1000,1001,-5}));
    }

    @Test void arrayOfIntsUnique_EmptyArray_Returns0(){
        assertEquals(0,arrayOfInts.sumOfUniqueValidNumbers(new int[0]));

    }
    @Test void ArrayOfIntsUnique_DoubleNumbers_ReturnsSumOfUniqueNumbers(){
        assertEquals(15,arrayOfInts.sumOfUniqueValidNumbers(new int[] {1,2,3,4,5,5}));

    }
    @Test void ArrayOfIntsUnique_UniqueNumbers_ReturnsSum(){
        assertEquals(15,arrayOfInts.sumOfUniqueValidNumbers(new int[] {1,2,3,4,5}));


    }
    @Test void ArrayOfIntsUnique_AllSameNumbers_ReturnsSumOfOnlyOne(){
        assertEquals(2,arrayOfInts.sumOfUniqueValidNumbers(new int[] {2,2,2,2,2}));

    }

    @Test void FindCommonElements_ArrayIsNull_ReturnException(){
        assertThrows(IllegalArgumentException.class, () ->
                findCommonElements.findCommonElements(null,null));
        assertThrows(IllegalArgumentException.class, () ->
                findCommonElements.findCommonElements(new int[] {1,2,3},null));
        assertThrows(IllegalArgumentException.class, () ->
                findCommonElements.findCommonElements(null,new int[] {1,2,3}));
    }

    @Test void FindCommonElements_ArrayIsEmpty_Return0(){
               assertArrayEquals(new int[1],findCommonElements.findCommonElements(new int[0],new int[0]));
           assertArrayEquals(new int[1],findCommonElements.findCommonElements(new int[] {1,2,3},new int[0]));
        assertArrayEquals(new int[1],findCommonElements.findCommonElements(new int[0],new int[] {1,2,3}));

    }
    @Test void FindCommonElements_ArrayCommonNumbers_ReturnsArrayWithCommonNumbers(){
        assertArrayEquals(new int[] {4,5},findCommonElements.findCommonElements(new int[] {1,2,3,4,5},new int[] {4,5,89,38,11}));

    }

    @Test void FindCommonElements_ArrayNoCommonNumbers_ReturnsArrayWithCommonNumbers(){
        assertArrayEquals(new int[0],findCommonElements.findCommonElements(new int[] {1,2,3,4,5},new int[] {6,7,8,9,10}));

    }

    @Test void FindDuplicateValues_ArrayIsEmpty_ReturnsEmptyArray(){
        assertArrayEquals(new int[0], findDuplicateValues.findDuplicateValues(new int[0]));
    }

    @Test void FindDuplicatesValues_ArrayIsNull_ReturnsException(){
        assertThrows(NullPointerException.class, () ->
                findDuplicateValues.findDuplicateValues(null));
    }
    @Test void FindDuplicatesValues_ArrayCorrect_ReturnsArrayWithDoubleNumbers(){
        assertArrayEquals(new int[] {4,7}, findDuplicateValues.findDuplicateValues(new int[] {1,4,4,7,7,8,9,10}));
    }

    @Test void FindDuplicatesValues_ArrayCorrect_ReturnsArrayWithUniqueNumbers(){
        assertArrayEquals(new int[] {}, findDuplicateValues.findDuplicateValues(new int[] {1,4,7,8,9,10}));
    }

}



// getal boven 1000 {1 2 3 4 5 1000 1001} 1015
// getal is negatief {1 2 3 4 -5} Illegal argument
// lege array [] 0
//foute paremeter null 0
//dubbele cijfers {1 2 3 4 5 5} 15
//enkele cijfers {1 2 3 4 5} 15
// alles gelijk {2 2 2 2 2} 2

// Findcommon
// array correct {1,2,3,4,5} : {3,8,4,9,10} returns {3,4}
// array leeg {} : {} = null
// array null : 0
// array no common

//FindDuplicates
// array leeg {}
// array null
// array correct:
// array uniek
