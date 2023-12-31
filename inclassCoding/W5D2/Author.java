package inclassCoding.W5D2;

import inclassCoding.W5D1.Ball2;

public class Author {
  String name;
  int age;

  public Author(String name, int age){
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object o){
    if(this == o){
      return true;
    }
    if(o instanceof Author){
      return false;
    }
    Author author = (Author) o;
    return author.name.equals(this.name);
  }
}
