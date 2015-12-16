Properties:
	Title = "Wireworld"
	Cell Size = (15, 15)
	Dimensions = (23, 23)
	Start = {								("Conductor", (11,9)),("Conductor", (12,9)),
			("ElectronHead", (4,10)),("Conductor", (5,10)), ("Conductor", (6,10)), ("Conductor", (7,10)), ("Conductor", (8,10)), ("Conductor", (9,10)), ("Conductor", (10,10)), ("Conductor", (11,10)), ("Conductor", (13,10)),("Conductor", (14,10)),("Conductor", (15,10)),("Conductor", (16,10)),("Conductor", (17,10)),("Conductor", (18,10)),
										("Conductor", (11,11)),("Conductor", (12,11))}
	Default Type = "Empty"
	Generations = 150
	Interval = 0.20

type ElectronHead:
	Neighborhood[0] = {VAR}

	setcolor to (0,0,255)
	
	if state == 2 then
		become "ElectronTail"
	endif
	if alive then 
		setstate to 2
	endif
endtype

type ElectronTail:
	Neighborhood[0] = {VAR}
	setcolor to (255,0,0)
	if state == 0 then
		setstate to 1
		become "Conductor"
	endif
	if state == 2 then 
		setstate to 0
	endif
endtype

type Conductor:
	Neighborhood[3] = {	1, 	1, 	1,
				1, 	VAR, 	1,
				1,	1,	1	}
	setcolor to (255,255,0)
	heads = neighbors that are "ElectronHead"
	if heads == 1 | heads == 2 then
		become "ElectronHead"
	endif
endtype

type Empty:
	Neighborhood[0] = {VAR}
	setcolor to (0,0,0)
endtype
