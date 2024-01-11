def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    left_array = arr[:mid]
    right_array = arr[mid:]

    left_array = merge_sort(left_array)
    right_array = merge_sort(right_array)

    return merge(left_array, right_array)


def merge(left, right):
    merged = []
    left_pos = 0
    right_pos = 0

    while left_pos < len(left) and right_pos < len(right):
        if left[left_pos] < right[right_pos]:
            merged.append(left[left_pos])
            left_pos += 1
        else:
            merged.append(right[right_pos])
            right_pos += 1

    merged.extend(left[left_pos:])
    merged.extend(right[right_pos:])

    return merged


if __name__ == "__main__":
    input_arr = [3, 5, 2, 90, 4, 7]
    sorted_arr = merge_sort(input_arr)
    print(sorted_arr)
