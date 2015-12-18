Properties:
	Title = "Random Sim"
	Cell Size = (6, 6)
	Dimensions = (80, 80)
	Default Type = "dude"
	Generations = 150
	Interval = 0.1


type dudette:
	Neighborhood[5] = {	  0, 0, 1, 0, 0,
				  0, 0, 2, 0, 0,				
				  1, 2, VAR,2, 1,
				  0, 0, 2, 0, 0,
				  0, 0, 1, 0, 0}
	setcolor to (255, 0, 255)
	if neighbors that are "dude" == 12 then
		create "dudette" at ((random(0,80)),(random(0,80)))
	endif
	alive
endtype

type dude:
	Neighborhood[5] = {	  0, 0, 1, 0, 0,
				  0, 0, 2, 0, 0,				
				  1, 2,VAR,2, 1,
				  0, 0, 2, 0, 0,
				  0, 0, 1, 0, 0}

	statecolor 0 is (255, 255, 255)
	statecolor 1 is (255, 0, 0)
	statecolor 2 is (255, 255, 255)
	rand = random(0, 100)
	if rand <= 10 then
		alive
	endif

	if neighbors that are "dudette" > 0 then
		if alive then
			alive
		endif
	else
		if state == 2 then
			dead
		else
			setstate to 2
		endif
	endif
endtype

world:
	// Randomly add a column or row
	rand = random(0,100)
	randX = random(0, 80)
	randY = random(0, 80)
	if rand <= 15 then
		create "dudette" at (randX, randY)
	endif
endworld
