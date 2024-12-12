package com.example.aufgabe3.model

import java.time.LocalDate
import java.util.UUID

/**
 * Represents a booking entry for a stay, containing the ID, arrival and departure dates, and the name of the guest.
 *
 * @property id The unique identifier for the booking entry. If not provided, it will be generated automatically.
 * @property arrivalDate The date the guest is scheduled to arrive.
 * @property departureDate The date the guest is scheduled to depart.
 * @property name The name of the guest who made the booking.
 */
data class BookingEntry(
    /**
     * The unique identifier for the booking entry. If not provided, it is automatically generated.
     */
    val id: String = UUID.randomUUID().toString(),

    /**
     * The date the guest is scheduled to arrive.
     */
    val arrivalDate: LocalDate,

    /**
     * The date the guest is scheduled to depart.
     */
    val departureDate: LocalDate,

    /**
     * The name of the guest who made the booking.
     */
    val name: String
)
