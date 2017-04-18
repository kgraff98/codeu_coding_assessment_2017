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

import java.io.IOException;

final class MyJSONParser implements JSONParser {

	/*Example
	'{ }'
    '{ "name": "sam doe" }'
    '{ "name": { "first": "sam", "last": "doe" } }'
    */

  @Override
  public JSON parse(String in) throws IOException {
    if(in == null){
    	throw IOException("Empty Object");
    }
	char current_parse;
	String to_parse = in;
    int nest_lvl = 0;
    boolean quoted = false;
 
    try{
		  for (current_parse = to_parse.charAt(0); to_parse.length > 0; current_parse = to_parse.charAt(0), to_parse = to_parse.substring(1))
			  {
				  switch (current_parse){
					  if (!quoted){
					  case '{':
						  nest_lvl++;
						  break;
					  case '}':
						  if (nest_lvl == 0){
							  throw IOException("Error");
						  }
						  nest_lvl--;
						  break;
					  default:
						  throw IOException("Error");
						  break;
					  }
				  case '"':
					  quoted = !quoted;
					  break;
				  }
			  default:
				  break;
			  }
		  return new MyJSON();
	  }
	  catch (Exception e) {
		  throw IOException("There is an error");
	  }
  }
}
