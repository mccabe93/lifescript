Properties:
	Title = "Wireworld"
	Dimensions = (6, 6)
	Default Type = "block"
	Generations = 20
	Interval = 1
	Pausable = false
	Steppable = true

x = 0

type block:
	Neighborhood[3] = {4, 2, 1,
			0, VAR, 0}

	statecolor 1 is (0,0,255)
	statecolor 2 is (0,255,0)
	statecolor 3 is (255,0,0)

	x = neighbors that are "block"
	print x	

	if x > 0 then
		setstate to 3
	else
		if alive then
			setstate to 2
		endif
	endif
endtype

world:
	create "block" at (4, x)
	x = x + 1
endworld
