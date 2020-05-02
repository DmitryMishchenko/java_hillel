
## IO

####Plan: 
Stream definition
represents different kinds of sources and destinations (disk files, devices, other programs, and memory arrays)
supports many different kinds of data, including simple bytes, primitive data types, localized characters, and objects. 


Input stream
Output stream

ByteStream (InputStream and OutputStream)
Don’t forget to close streams

Decorator pattern (inheritance static, decorator dynamic) (on example of I/O)

InputStreamReader - FileInputStream
basic functionality for reading or writing an un‐ structured sequence of bytes

Reader and Writer (see constructor)
basic functionality for reading or writing a sequence of character data, with support for Unicode
Buffering
flush()

PrintWriter
Scanner 
Serialization (FileInputStream, ObjectInputStream, serialization graph, Serializable marking interface, transient keyword)

Formats:
- binary (protobuf, Parquet, Avro)
- text (CSV, JSON, XML)

####Task:
Приложение по сохранению объектов класса Студент 
сохранить журнал
сохранить студента
восстановить студента 