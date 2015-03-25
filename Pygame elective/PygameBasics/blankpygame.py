import pygame, sys
from pygame.locals import *

pygame.init()

DISPLAYSURF = pygame.display.set_mode((400, 300))
#tells the set_mode function how wide and how high to make the windows in pixels. pygame.Surface object for the window
pygame.display.set_caption('Hello World')
#this sets the caption text that will appear at the top of the window.
#the string is passed in the function call to make the text appear as the caption

while True:
    for event in pygame.event.get():
        #
        if event.type == QUIT:
            pygame.quit()
            sys.exit()
    pygame.display.update()