Security
====

CAM Overflow - Attack Scenario
----

- CAM: Content Addressable Memory - aka MAC-Addresstable
- Fixed Size (eg 8000 entries)
- Host **XY** sends multiple L2 Frames with different MAC Adresses
- Switch stores them in CAM Table
- Switch behaves like Hub, as soon as CAM Table is full
- Attacker floods the CAM-Table and then is able to send to all users of network, due to the routers-hub-behaviour

CAM Overflow - Countermeasures
----

- Limit MAC entries in CAM per interface
- Cisco: ``port-security``
- Specify maximum MAC-Addresses on given Interface
- Specify MAC-Addresses explicitly

```
Switch(config-ig)# switchport port-security // Enables port security on the interface

Switch(config-ig)# switchport port-security maximum VALUE // (Optional) sets the maximum number of secure MAC addresses for the interface. The range is 1 to 3072, the default is 1.

Switch(config-ig)# switchport port-security violation (restrict | shutdown) // (Optional)

Switch(config-ig)# switchport port-security limit rate invalid-source-mac

Switch(config-ig)# switchport port-security mac-address MAC_ADDRESS

Switch(config-ig)# switchport port-security mac-address sticky // (optional) Enable sticky learning on the interface. This means, that only the first MAC-Address is allowed to be in this interface.
```

----

DHCP Starvation - Attack Scenario
----

- Host sends multiple DHCP-Requests to SHCP-Server
- DHCP-Server has limited amount of addresses available (DHCP-Pool)
- DHCP Pool is depleted by requests from attacker
- No further clients will be able to request an address
- Can be combined with the following attack

DHCP Starvation - Countermeasures
----

- DHCP Request have to come from different MAC-Addresses
- Limiting MAC-Addresses on the interface prevents those unwanted DHCP-Requests
- Cisco: port-security

```
Switch(config-ig)# switchport port-security

Switch(config-ig)# switchport port-security maximum VALUE

Switch(config-ig)# switchport port-security violation (restrict | shutdown)

Switch(config-ig)# switchport port-securitylimit rate invalid-source-mac
```

----

DHCP-Spoofing - Attack Scenario
----

- Attacker installs its own DHCP-Server on the network segment
- Clients will broadcast DHCP-Discovery and DHCP-Requests to all Hosts on the network segment
- Attacker-DHCP will answer first, because it is local to the requesting host
- Attacker-DHCP can be used to configure wrong DNS-Servers or even Default Gateway Address on the victim
- Man in the middle attacks are possible

DHCP-Spoofing - Countermeasures
----

- Specify the incoming interface for legitimate DHCP-Messages from DHCP-Server
- Cisco: DHCP-Snooping
- Enable DHCP-Snooping on all VLANs, specify trusted interface

German:

- Am Router wird ein dhcp-snooping interface eingerichtet.
- Damit sind DHCP-Offer nur noch an 1 bestimmten interface zulässig und alle anderen werden verworfen

```
Router(config)# ip dhcp vlan {{ VLAN_ID [VLAN_ID]} | VLAN_RANGE}
Router(config)# interface {TYPE SLOT/PORT | port-channel NUMBER}
Router(config)# ip dhcp snooping trust
```

----

ARP-Poisoning - Attack-Scenario
----

- Attacker sends ARP Messages to inject its own MAC and IP-Addresses into ARP-Tables of other hosts on the network segment
- ARP Messages can be used to impersonate as the default gateway
- Man in the Middle Attack is possible
