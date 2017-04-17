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
  // GET OBJECT
  // Get the value of the nested object with the given name. If there is
  // no nested object with that name, the method will return null.
  @Override
  public JSON getObject(String name) {
    //Checks if name is null
    if(name == null) {
      return null;
    }
    //Get the object value associated with the name
    JSON json = this.get(name);
    //Check if the object is null, throws exception otherwise
    if(json == null) {
      return null;
    }
    //Return the nested JSON object
    return json;
  }
  // SET OBJECT
  // Set the value of the nested object with the given name. Any old value
  // should be overwritten. This method will always return a reference to
  // "this".
  @Override
  public JSON setObject(String name, JSON value) {
    //checks if name is null
    if(name == null) {
      return null;
    }
    //checks if value is null
    if(value == null) {
      return null;
    }
    this.opt(name) = value;
    return this;
  }
  // GET STRING
  // Get the string value within this object that has the given name. if
  // there is no string with the given name, the method will return null.
  @Override
  public String getString(String name) {
      JSON json = this.get(name);
      if (json instanceof String) {
        return (String) json;
      }
      else {
        return null;
    }
  }

  @Override
  public JSON setString(String name, String value) {
    // TODO: implement this
    return this;
  }

  @Override
  public void getObjects(Collection<String> names) {
    // TODO: implement this
  }

  @Override
  public void getStrings(Collection<String> names) {
    // TODO: implement this
  }
}
