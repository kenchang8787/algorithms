package main

import "fmt"

func main() {
	// example 1
	fmt.Println(twoSum([]int{2, 7, 11, 15}, 9))

	// example 2
	fmt.Println(twoSum([]int{3, 2, 4}, 6))

	// example 3
	fmt.Println(twoSum([]int{3, 3}, 6))
}

func twoSum(nums []int, target int) []int {

	var seen = make(map[int]int)

	for index, number := range nums {

		value, exist := seen[target-number]
		fmt.Println(value, exist)

		if exist {
			return []int{index, value}
		}

		seen[number] = index
	}

	return []int{0, 0}
}
