<div align="center">

# 📁 File Operations in Java

[![GitHub stars](https://img.shields.io/github/stars/Shubh2-0/File_Operations_in_Java?style=for-the-badge&logo=github&color=yellow)](https://github.com/Shubh2-0/File_Operations_in_Java/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Shubh2-0/File_Operations_in_Java?style=for-the-badge&logo=github&color=blue)](https://github.com/Shubh2-0/File_Operations_in_Java/network/members)

### Master Java File I/O

*Read, write, copy, rename - complete file handling guide*

</div>

---

## 🎯 About

Learn efficient **file handling in Java** with practical examples. Master reading, writing, and manipulating files for robust applications.

## 📚 Topics Covered

| Operation | Classes Used |
|-----------|--------------|
| Read Files | FileReader, BufferedReader, Scanner |
| Write Files | FileWriter, BufferedWriter, PrintWriter |
| Copy Files | Files.copy(), Stream-based |
| Delete/Rename | File.delete(), File.renameTo() |
| Directory Ops | File.mkdir(), File.list() |

## 💻 Examples

```java
// Reading file
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
}

// Writing file
try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
    bw.write("Hello, World!");
}

// Java NIO (Modern way)
List<String> lines = Files.readAllLines(Paths.get("file.txt"));
Files.write(Paths.get("output.txt"), lines);
```

## 🛠️ Technologies

Java 8+ | NIO | File I/O

## 📬 Contact

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/shubham-bhati-787319213/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:shubhambhati226@gmail.com)

---

**Keywords:** Java File-IO FileReader FileWriter BufferedReader NIO File-Handling Stream





