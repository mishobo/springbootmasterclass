package com.husseinabdallah.SpringBootMasterClass;

import com.husseinabdallah.SpringBootMasterClass.leetCode.sumoftwo.TwoSum;
import com.husseinabdallah.SpringBootMasterClass.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootMasterClassApplicationTests {

	@Test
	public void givenValidNameAndAddress_whenGetNameAndAddress_thenExpectedValuesReturned() {
		String name = "John Doe";
		String address = "100 Linda Ln.";

		Person person = new Person(name, address);

		assertEquals(name, person.name());
		assertEquals(address, person.address());
	}

	@Test
	public void givenSameNameAndAddress_whenHashCode_thenPersonsEqual() {
		String name = "John Doe";
		String address = "100 Linda Ln.";
		Person person1 = new Person(name, address);
		Person person2 = new Person(name, address);

		assertEquals(person1.hashCode(), person2.hashCode());
		System.out.println("Test executed");
	}


	@Test
	public void testAddTwoNumbers2() {
		// example 1
		int target = 9;
		int[] nums = new int[]{2, 7, 11, 15};
		int[] expected = new int[]{0, 1};


		TwoSum twoSum = new TwoSum();
		int[] result =  twoSum.twoSum(nums, target);
		System.out.println("Test executed result: " + Arrays.toString(result));

		assertEquals(Arrays.toString(expected), Arrays.toString(result));

		// example 2
		int target1 = 6;
		int[] nums1 = new int[]{3, 2, 4};
		int[] expected1 = new int[]{1, 2};
		int[] result1 =  twoSum.twoSum(nums1, target1);
		System.out.println("Test 1 executed result: " + Arrays.toString(result1));

		assertEquals(Arrays.toString(expected1), Arrays.toString(result1));
	}


}
