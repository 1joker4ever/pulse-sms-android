/*
 * Copyright (C) 2016 Jacob Klinker
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
 */

package xyz.klinker.messenger.util.listener;

import xyz.klinker.messenger.data.model.Conversation;
import xyz.klinker.messenger.data.model.Message;

/**
 * Listener for getting callbacks when an item is searched for and clicked on.
 */
public interface SearchListener {

    void onSearchSelected(Message message);

    void onSearchSelected(Conversation conversation);

}
