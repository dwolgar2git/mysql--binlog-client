/*
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.github.mysqlbinlog.model.event.extra;

import java.io.Serializable;

public abstract class Column implements Serializable {
    private static final long serialVersionUID = -3829478841053596810L;
    private final int type;
    
    public Column(int type) {
        this.type = type;
    }
    
    public int getType() {
        return type;
    }
    
    abstract public Object getValue();
}