/*
 * Copyright 2016 BananaRama.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cache.expiration;
import org.bananarama.cache.providers.collection.ConcurrentIndexedCollectionProvider;

/**
 *
 * @author Guglielmo De Concini
 */
public class ExpiringCollectionProvider<O> extends ConcurrentIndexedCollectionProvider<O>{

    protected final static int time = 1;
    
    @Override
    public int timeToLive(){
        return time;
    }
}
