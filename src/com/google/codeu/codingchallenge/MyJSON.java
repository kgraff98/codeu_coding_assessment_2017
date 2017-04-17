// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.codingchallenge;

import java.util.Collection;

final class MyJSON implements JSON {

  private String name;
  private String val;
  private JSON value;

  public MyJSON(String name, JSON value) {
    this.name = name;
    this.value = value;
  }
  //get name of object
  public String getName() {
    return this.name;
  }
//----------------------------------------------------------------------------------------------
  // GET OBJECT
  // Get the value of the nested object with the given name. If there is
  // no nested object with that name, the method will return null.
  @Override
  public JSON getObject(String name) {
    //Check if name is null
    if(name == null) {
      return null;
    }

    //Check if object name is equal to name
    if(this.getName().equals(name)){
      //Return object if True
      return this;
    }
    else{
      return null;
    }
  }
//----------------------------------------------------------------------------------------------
  // SET OBJECT
  // Set the value of the nested object with the given name. Any old value
  // should be overwritten. This method will always return a reference to
  // "this".
  @Override
  public JSON setObject(String name, JSON value) {
    //Check if object name is equal to name
    if(this.getName().equals(name)){
      //Set value equal to new value
      this.value = value;
    //Always return reference to "this"
    return this;
  }
//----------------------------------------------------------------------------------------------
  // GET STRING
  // Get the string value within this object that has the given name. if
  // there is no string with the given name, the method will return null.
  @Override
  public String getString(String name) {
    //Check if name is null
    if(name == null) {
      return null;
    }

    //Check if object name is equal to name
    if(this.getName().equals(name)){
      //Return string value if True
      return this.val;
    }
    else {
      return null;
    }
  }
//----------------------------------------------------------------------------------------------
  // SET STRING
  // Set the string that should be stored under the given name. Any old value
  // should be overwritten. This method will always return a reference to
  // "this".
  @Override
  public JSON setString(String name, String value) {
    //Check if object name is equal to name
    if(this.getName().equals(name)){
      //Set string value equal to new value
      this.val = value;
    //Always return reference to "this"
    return this;

//----------------------------------------------------------------------------------------------
  // GET OBJECTS
  //
  // Copy the names of all object values to the given collection.
  @Override
  public void getObjects(Collection<String> names) {
    // TODO: implement this
  }
  // GET STRINGS
  //
  // Copy the names of all string values to the given collection.
  @Override
  public void getStrings(Collection<String> names) {
    // TODO: implement this
  }
}
