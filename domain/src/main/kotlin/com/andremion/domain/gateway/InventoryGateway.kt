/*
 * Copyright (c) 2018. André Mion
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

package com.andremion.domain.gateway

import com.andremion.domain.entity.Event
import com.andremion.domain.entity.Rating
import com.andremion.domain.entity.Venue
import io.reactivex.Observable

interface InventoryGateway {

    fun findEventsByType(type: Int, refresh: Boolean = false): Observable<List<Event>>

    fun getVenueById(id: Int): Observable<Venue>

    fun getEventById(id: Int): Observable<Event>

    fun findRatingByEvent(event: Int, refresh: Boolean = false): Observable<Rating>
}