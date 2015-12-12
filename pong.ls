Properties:
	Title = "Pong"
	Dimensions = (15, 15)
	Start = {("block", (0,9))}
	Default Type = "block"
	Generations = 10
	Interval = 0.5
	Pausable = false
	Steppable = true
	Cell Size = (10, 10)


type block:
	Neighborhood[3] = {VAR}
	
	x = random(0, 100)
	if x <= 75 then
		dead
		setcolor to (255, 255, 255)
	else
		alive
		setcolor to (255, 0, 255)
	endif
endtype

