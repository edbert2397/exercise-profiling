Hasil Jmeter GUI sebelum profiling
![img1.png](img1.png)
![img2.png](img2.png)
![img3.png](img3.png)

Hasil JMeter CLI
![img4.png](img4.png)
![img5.png](img5.png)
![img6.png](img6.png)

Hasil JMeter setelah profiling
![img7.png](img7.png)
![img8.png](img8.png)
![img9.png](img9.png)

kecepatan request kedua implementasi terlihat jauh berbeda.  Kesimpulannya adalah optimisasi implementasi method akan sangat berpengaruh pada pengujian kecepatan aplikasi.

1. JMeter memberi tau sample time pada saat request sampai response didapatkan, sedangkan Intellij Profiler dapat memberi tau execution time dari setiap method
2. prosess profiling dapat memberi tau flame tree, method list, dan timeline, yang mana memberi tau bagian mana pada code yang menggunakan waktu lebih banyak
3. Intellij profiler membantu saya untuk mencari tau bagian mana pada program yang lambat karena memberikan CPU time pada setiap method.
4. Hal ini adalah konsep baru bagi saya sehingga saya butuh beberapa saat waktu untuk mengerti konsep dari testing dan profiling. Saya pun mencoba mempelajari step by step sehingga saya dapat lebih paham.
5. Intelij profiler memberikan pinpoint pada bagian code mana yagn lambat dan membutuhkan optimisasi. Intellij profiler juga memfasilitasi untuk membandingkan hasil sebelum dan sesudah perubahan pada code
6. Saat terjadi perbedaan hasil, memeriksa kembali bagian pada code tersebut. Sehingga refactoring yang dilakukan dapat dilihat apakah sudah lebih optimal atau belom.
7. Memperbaiki code dengan mengurangi space/time complexity nya. Untuk mengecek apakah perubahan yang dilakukan memberikan efek pada fungsionalitas, maka dapat melakukan prinsip TDD, yang mana hasil dari code baru ini harus sesuai dengan yang diexpect.