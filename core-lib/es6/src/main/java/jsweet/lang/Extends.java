/* 
 * JSweet - http://www.jsweet.org
 * Copyright (C) 2015 CINCHEO SAS <renaud.pawlak@cincheo.fr>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jsweet.lang;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation type is used on classes that need to declare that they extend
 * multiple classes (which is not possible in Java).
 * 
 * <p>
 * In JSweet, most of the time, the API definitions use classes instead of
 * interfaces by choice, in order to be able to define properties with fields.
 * This way the syntax and use of the API is simpler and closer to the targeted
 * code. However, in some cases, the API would require multiple inheritance,
 * which is then specified through this annotation. This annotation reflects
 * that the extended class members have been duplicated into the extending
 * class, and that the transpiler shall not complain when using a dynamic casts
 * between the extended and extending classes.
 * 
 * @see Interface
 * @author Renaud Pawlak
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Extends {

	/**
	 * The classes extended by the currently annotated class.
	 */
	Class<?>[] value();

}
