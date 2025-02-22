# 🔍 Search Algorithms in Java  

## 📌 About the Project  
This repository contains implementations of two fundamental search algorithms in Java:  

- **Linear Search** 🟢 - A simple search algorithm that checks each element one by one.  
- **Binary Search** 🔵 - A faster search algorithm that works on sorted arrays using the divide-and-conquer approach.  

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

## 📂 Project Structure  

```
/Search-Algorithms
│── binarySearch.java
│── linearSearch.java
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
javac binarySearch.java linearSearch.java
java binarySearch
java linearSearch
```

## 👨‍💻 Author  
[TechYash-bit](https://github.com/TechYash-bit)   
