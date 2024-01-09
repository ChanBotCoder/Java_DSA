def bubble_sort(input_list):
    swapping = True
    while swapping:
        swapping = False
        for i in range(len(input_list) - 1):
            if input_list[i] > input_list[i + 1]:
                print(f"Swapping pair {input_list[i]}, {input_list[i + 1]}")
                input_list[i], input_list[i + 1] = input_list[i + 1], input_list[i]
                print(input_list)
                swapping = True
    return input_list

if __name__ == "__main__":
    count_backwards = [9, 8, 7, 6, 5, 4, 3, 2, 1]
    print("Starting BubbleSort on reverse sorted:", count_backwards)
    bubble_sort(count_backwards)
    print("After BubbleSort:", count_backwards)

    count_forwards = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    print("Starting BubbleSort on sorted:", count_forwards)
    bubble_sort(count_forwards)
    print("After BubbleSort:", count_forwards)
