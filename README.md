# 🔍 Search & Sorting Algorithms in Java  

## 📌 About the Project  
This repository contains implementations of three fundamental algorithms in Java:  

- **Linear Search** 🟢 - A simple search algorithm that checks each element one by one.  
- **Binary Search** 🔵 - A faster search algorithm that works on sorted arrays using the divide-and-conquer approach.  
- **Selection Sort** 🟠 - A sorting algorithm that repeatedly selects the smallest element and swaps it into place.  

## 🚀 How It Works  

### **1️⃣ Linear Search**  
- **Time Complexity:** `O(n)`  
- **Best for:** Small or unsorted datasets  
- **How it works:**  
  1. Start from the first element and compare it with the target value.  
  2. If found, return the index; otherwise, move to the next element.  
  3. If the target is not found, return `-1`.  

### **2️⃣ Binary Search**  
- **Time Complexity:** `O(log n)`  
- **Best for:** Large, sorted datasets  
- **How it works:**  
  1. Check the middle element of the sorted array.  
  2. If it matches the target, return the index.  
  3. If the target is smaller, search in the left half; otherwise, search in the right half.  
  4. Repeat until the element is found or the search space is empty.  

### **3️⃣ Selection Sort**  
- **Time Complexity:** `O(n²)`  
- **Best for:** Small datasets, simple implementation  
- **How it works:**  
  1. Find the smallest element in the array.  
  2. Swap it with the first element.  
  3. Repeat for the remaining unsorted elements.  

## 📂 Project Structure  

```
/Algorithms
│── binarySearch.java
│── linearSearch.java
│── selectionSort.java
│── README.md
```

## 🛠 How to Run  

### Clone this repository:  
```bash
git clone https://github.com/your-username/Search-Algorithms.git
```

### Navigate to the project directory:  
```bash
cd Search-Algorithms
```

### Compile and run the Java files:  
```bash
javac binarySearch.
java binarySearch

java linearSearch.
java linearSearch

java selectionSort.java
java selectionSort
```

## 👨‍💻 Author  
[TechYash-bit](https://github.com/TechYash-bit)  
